$(document).ready(function() {
	var oTable = $('#tableId').dataTable({
		"processing" : true,
		"ajax" : {
			"url" : "/progettoSecondo/TabellaServlet",
			"dataSrc" : "demo",
			"type" : "GET"
		}
	});
});
