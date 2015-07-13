function editStory(id) {

	$.get("get/" + id, function(result) {

		$("#bookDialog").html(result);

		$('#bookDialog').dialog("option", "title", 'Edit Book');

		$("#bookDialog").dialog('open');

		initializeDatePicker();
	});
}

function initializeDatePicker() {
	$(".datepicker").datepicker({
		dateFormat : "yy-mm-dd",
		changeMonth : true,
		changeYear : true,
		showButtonPanel : true
	});
}

$(document).ready(function() {

	$('#bookDialog').dialog({

		autoOpen : false,
		position : 'center',
		modal : true,
		resizable : false,
		width : 440,
		buttons : {
			"Save" : function() {
				$('#bookForm').submit();
			},
			"Cancel" : function() {
				$(this).dialog('close');
			}
		},
		close : function() {

			resetDialog($('#bookForm'));

			$(this).dialog('close');
		}
	});

	initializeDatePicker();
});