//服务层
app.service('cusinfoService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../cusinfo/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../cusinfo/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../cusinfo/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../cusinfo/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../cusinfo/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../cusinfo/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../cusinfo/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
