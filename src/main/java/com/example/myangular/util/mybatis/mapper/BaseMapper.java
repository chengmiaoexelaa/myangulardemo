package com.example.myangular.util.mybatis.mapper;

public interface BaseMapper<T> {

}
//import java.io.Serializable;
//import java.util.List;
//
//import com.example.myangular.util.mybatis.pojo.PageModel;
//import org.apache.ibatis.annotations.Param;
///**
// * Mybatis基础DAO
// * @author chengmiao
// */
//public interface BaseMapper<T> {
//
//	/**
//	 * 通过ID查询
//	 * @param id
//	 * @return
//	 */
//	Object selectById(Serializable id);
//
//	/**
//	 * 查询单条记录
//	 * @param obj
//	 * @return
//	 */
//	Object selectOne(@Param("item") Object obj);
//
//	/**
//	 * 查询记录集合
//	 * @param obj
//	 * @return
//	 */
//	List<?> selectList(@Param("item") Object obj);
//
//	/**
//	 * 分页查询
//	 * @param obj
//	 * @param page
//	 * @return
//	 */
//	List<T> selectPage( @Param ("item") Object obj, @Param("page") PageModel page);
//
//	/**
//	 * 通用的保存方法
//	 * @param
//	 * @param obj
//	 */
//	void save(@Param("item") Object obj);
//
//	/**
//	 * 批量保存
//	 * @param list
//	 */
//	int batchSave(List<?> list);
//
//	/**
//	 * 通用的修改方法
//	 * @param
//	 * @param obj
//	 */
//
//	int update(@Param("item") Object obj);
//
//	/**
//	 * 批量更新
//	 * @param list
//	 * @return
//	 */
//	int batchUpdate(List<?> list);
//
//	/**
//	 * 删除方法
//	 * @param id
//	 */
//	int delById(Serializable id);
//
//	/**
//	 * 批量删除
//	 * @param list
//	 * @return
//	 */
//	int delList(List<?> list);
//
//	/**
//	 * 批量删除方法
//	 * @param ids
//	 */
//	int delArray(int[] ids);
//
//	/**
//	 * 统计查询
//	 * @param
//	 * @param obj 查询参数
//	 * @return 总记录条数
//	 */
//	int count(Object obj);
//
//}
