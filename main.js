$(document).ready(function() {

	$.getJSON("./contacterInfo.json", function(data) {
		if (!data) {
			alert("read json file failed!");
		}

		var contacterList = data.profile;

		contacterList.forEach(function(contacter) {
			var lastname = contacter.lastname;
			var firstname = contacter.firstname;
			var phone = contacter.Phonenumber;
			var photo = contacter.Photo.slice(5);
			var address = contacter.Address;

			var tempStr = "id='"+ lastname +"' data-fname='"+ 
				firstname +"' data-phone='"+ phone +"' data-photo='"+
				photo +"' data-address='"+ address +"'";

			$("#contacterList").append(
				"<li><a "+ tempStr +" href='#detail' data-rel='popup'>" + contacter.lastname + "</a></li>"
				);
			$("#"+contacter.lastname).on('click', function(e) {
				var target = $(e.target);

				
				$('#lastname').html(e.target.id);
				$('#firstname').html("Fitst name:"+target.attr('data-fname'));
				console.log(target.attr('data-fname'));
				$('#phone').html("Phone: "+target.attr('data-phone'));
				$('#address').html("Address: "+target.attr('data-address'));
				$('#photo').attr("src", target.attr('data-photo'));
			});

		})

		$("#btncreate").on('click',function(){
		   var newcontacter = contacterList.push();
		   
		   var newlastn = $('#Lastname').val();
		   var newfirstn = $('#Firstname').val();
		   var newphonen =$('#PhoneNumber').val();

		   console.log(newlastn+'123');
		   
		})   

		$('#contacterList').listview("refresh");


		   

		


	});

});

