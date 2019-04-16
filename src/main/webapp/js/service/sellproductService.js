//服务层
app.service('sellproductService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../sellproduct/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../sellproduct/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../sellproduct/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../sellproduct/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../sellproduct/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../sellproduct/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../sellproduct/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
