//服务层
app.service('cusevalService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../cuseval/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../cuseval/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../cuseval/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../cuseval/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../cuseval/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../cuseval/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../cuseval/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
