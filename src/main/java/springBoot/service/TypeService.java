package springBoot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import springBoot.po.Type;

public interface TypeService {
	
	Type saveType(Type type);
	
	Type getType(Long id);
	
	Type getTypeByName(String name);
	
	Page<Type> ListType(Pageable pageable);
	
	Type updateType(Long id, Type type);
	
	void deleteType(Long id);
	
	List<Type> listType();	//blogs搜索条件的分类里面的内容列表
	
	List<Type> listTypeTop(Integer size);	//获取index首页的分类的获取的条目数量,例如我只展示5个分类
}
