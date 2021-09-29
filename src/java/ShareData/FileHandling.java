package ShareData;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class FileHandling {

    public String uploadFile(HttpServletRequest request, HttpServletResponse response, String formImgName, String nameSave)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        final String path = request.getServletContext().getRealPath("/images");
        Part filePart = request.getPart(formImgName);
        OutputStream out = null;
        InputStream filecontent = null;
        String fileName = nameSave +"."+ getFileExtension(filePart);
        final String filePath = path + File.separator + fileName;  
        try {
            out = new FileOutputStream(new File(filePath));
            filecontent = filePart.getInputStream();
            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
        } catch (FileNotFoundException fne) {
            LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}",
                    new Object[]{fne.getMessage()});
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
            return "images\\" + fileName;
        }
    }
    private String getFileExtension(final Part part) {
        String originalFileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
        String[] split = originalFileName.split("\\.");
        return split[split.length-1];
    }
}
