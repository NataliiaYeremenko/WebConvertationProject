/**
 * Created by Nataliya on 27.02.2017.
 */
var main = {
    registration: function () {
        var log = document.getElementById("logReg").value;
        var email = document.getElementById("mailReg").value;
        var pass = document.getElementById("passReg").value;
        $.ajax({
            type: "POST",
            url: "/WebConvertationProject",
            dataType: "json",
            data: {requestType: "registration", login: log, email: email, password: pass},
            success: function (data) {
                console.log(data);
                document.location.href = 'User_cabinet.html';
            }
        });
    },

    log_in: function () {
        var log = document.getElementById("login").value;
        var pass = document.getElementById("password").value;
        $.ajax({
            type: "POST",
            url: "/WebConvertationProject",
            dataType: "json",
            data: {requestType: "login", login: log, password: pass},
            success: function (data) {
                if(data.name == "error")
                    document.location.href = 'errorPage.html';
                else
                    document.location.href = 'User_cabinet.html';
                    window.onload = function() {
                        document.getElementById("name").innerHTML = data.name;
                        document.getElementById("index").innerHTML = data.indexNumber;
                }

            }
        });
    }


};