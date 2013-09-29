$(document).ready(function (){
    $(".subMenu").click(function(){
        var btn = this.id;
        console.log(btn);
        $.ajax({
            type: "POST",
            url: '_subMenuImages',
            data: {
                selectedBtn: btn,
            }, 
            success: function(data) {
                $('#subMenuImages').html(data);
            }

        });
    });
});
