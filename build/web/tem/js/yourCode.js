function Show() {
    if (document.getElementById('test').style.display === "none") {
        document.getElementById('test').style.display = "none";
        document.getElementById('test1').innerHTML = "next";
    } else {
        document.getElementById('test1').style.display = "none";
        document.getElementById('test1').innerHTML = "hide";
    }
}