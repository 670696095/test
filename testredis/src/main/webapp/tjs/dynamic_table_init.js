

$(document).ready(function() {

    $('#dynamic-table').dataTable( {
    	"bSort": false,
   	 	"aLengthMenu": [[3, 5, 10, -1], [3, 5, 10, "All"]],
   	 	"oLanguage": {
   	 	"sLengthMenu": "每页显示 _MENU_ 条记录",
   	 	"sZeroRecords": "抱歉， 没有找到",
   	 	"sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
   	 	"sInfoEmpty": "没有数据",
   	 	"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
   	 	"sSearch":'高级搜索',
   	 	"oPaginate": {
   	 	"sFirst": "首页",
   	 	"sPrevious": "前一页",
   	 	"sNext": "后一页",
   	 	"sLast": "尾页"
   	 	},
   	 	"sZeroRecords": "没有检索到数据",
   	 	"sProcessing": "<img src='./loading.gif' />"
   	 	}
 
    	
    	                
             
         
    });
   
  
} );
