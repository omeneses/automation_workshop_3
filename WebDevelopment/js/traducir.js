    var el = document.getElementById('novia');
    document.getElementById('translate').onclick = function () {myTranslate()};
    
    

    function myTranslate(){
        if (el.innerHTML == "Te amo chiqui"){
            el.innerHTML="I love you Chiqui";
            console.log(el.innerHTML);
        }
        else {
            el.innerHTML='Te amo chiqui';
            console.log(el.innerHTML);
        }
        //document.getElementById('novia').innerHTML = "I love you Chiqui";
}
