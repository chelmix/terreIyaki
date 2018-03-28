function getXhr() {
    var xhr = null;
    if (window.XMLHttpRequest) // Firefox et autres
        xhr = new XMLHttpRequest();
    else if (window.ActiveXObject) { // Internet Explorer
        try {
            xhr = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    else { // XMLHttpRequest non supporté par le navigateur
        alert("Votre navigateur ne supporte pas AJAX");
        xhr = false;
    }
    return xhr;
}

function displayOrderCustomization(id){
    var div = document.getElementById("order-item-customization"+id);
    var xhr = getXhr();
    var url="FrontController?section=kitchen&action=get-customization&item-id="+id;
   //alert(url);
    xhr.open("GET",url,true);
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var reponse = xhr.responseText;
            // alert(reponse);            
            div.innerHTML = reponse;
        }
    };
    if (div.style.display === "none") {
        div.style.display = "block";
    } else {
        div.style.display = "none";
    }
    xhr.send(null);
}








