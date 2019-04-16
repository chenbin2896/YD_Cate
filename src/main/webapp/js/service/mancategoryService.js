//服务层
app.service('mancategoryService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../mancategory/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../mancategory/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../mancategory/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../mancategory/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../mancategory/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../mancategory/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../mancategory/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
