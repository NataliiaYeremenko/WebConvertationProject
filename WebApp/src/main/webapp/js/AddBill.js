/**
 * Created by Abakumov on 05.09.2016.
 */
var main = {
    add_bill: function () {
        var operationType = document.getElementById("type").value;
        var date =$("#date").value; //document.getElementById("date").value;
        var price = document.getElementById("price").value;
        var category = document.getElementById("category").value;
        var currency = document.getElementById("currency").value;
        var summary = document.getElementById("summary").value;
        var type = "add_Bill";
        var  index = 1;
        $.ajax({
            type: "POST",
            url: "/WebFinancialOrganizer",
            dataType: "json",
            data: {requestType: "bill", type: type, index: index, operationType: operationType, date: date, price: price, currency: currency, category: category, summary: summary},
            success: function (data) {
                if(data.State == "error")
                console.log("error");
            }
        });
    }
};