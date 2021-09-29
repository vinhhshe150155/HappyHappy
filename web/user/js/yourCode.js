function Show() {
    if (document.getElementById('test2').style.display === "none") {
        document.getElementById('test2').style.display = "block";
    } else {
        document.getElementById('test1').style.display = "none";
        document.getElementById('test1').innerHTML = "hide";
    }
}