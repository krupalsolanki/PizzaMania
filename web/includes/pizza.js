$(document).ready(function (){
//    function details(){
//        $.ajax({
//            type: "POST",
//            url: '_pizzaDetails',
//            data: {
//                itemID: item
//            }, 
//            success: function(data) {
//                alert(data);
//                $('#pizzaDetailsTab').html(data);
//            }
//
//        });
//    }
    $(".subMenu").click(function(){
        var btn = this.id;
        $.ajax({
            type: "POST",
            url: '_subMenuImages',
            data: {
                selectedBtn: btn
            }, 
            success: function(data) {
                alert(data);
                $('#menuImgTab').html(data);
            }

        });
    });
    $(".item").click(function(){
        var item = this.id;
        alert(item);
        $.ajax({
            type: "POST",
            url: '_pizzaDetails',
            data: {
                itemID: item
            }, 
            success: function(data) {
                alert(data);
                $('#pizzaDetailsTab').html(data);
            }

        });
    });
   $("#addToCart").click(function (){
       var addItem = this.id;
       alert(addItem);
       $.ajax({
            type: "POST",
            url: '_addToCart',
            data: {
                itemID: addItem
            }, 
            success: function(data) {
                alert(data);
                $('#cart').html(data);
            }
        });
   }); 
    
});
