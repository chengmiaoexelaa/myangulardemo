package com.example.myangular.util.mybatis.generator;
public class GenCommentGenerator{

}
//import java.util.Properties;
//
//import org.mybatis.generator.api.CommentGenerator;
//import org.mybatis.generator.api.IntrospectedColumn;
//import org.mybatis.generator.api.IntrospectedTable;
//import org.mybatis.generator.api.dom.java.CompilationUnit;
//import org.mybatis.generator.api.dom.java.Field;
//import org.mybatis.generator.api.dom.java.InnerClass;
//import org.mybatis.generator.api.dom.java.InnerEnum;
//import org.mybatis.generator.api.dom.java.Method;
//import org.mybatis.generator.api.dom.java.Parameter;
//import org.mybatis.generator.api.dom.java.TopLevelClass;
//import org.mybatis.generator.api.dom.xml.XmlElement;
//import org.mybatis.generator.internal.util.StringUtility;
//
///**
// * 自定义注解
// * @author CZH
// */
//
//public class GenCommentGenerator implements CommentGenerator {
//
//	public GenCommentGenerator() {
//		super();
//	}
//
//	/**
//	 * 给字段添加数据库备注
//	 * @param field
//	 * @param introspectedTable
//	 * @param introspectedColumn
//	 */
//	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//			field.addJavaDocLine("//" + introspectedColumn.getRemarks());
//		}
//	}
//
//	/**
//	 * getter方法注释
//	 * @param method
//	 * @param introspectedTable
//	 * @param introspectedColumn
//	 */
//	public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//		StringBuilder sb = new StringBuilder();
//		method.addJavaDocLine("/**");
//		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//			sb.append(" * 获取");
//			sb.append(introspectedColumn.getRemarks());
//			method.addJavaDocLine(sb.toString());
//			method.addJavaDocLine(" *");
//		}
//		sb.setLength(0);
//		sb.append(" * @return ");
//		sb.append(introspectedColumn.getActualColumnName());
//		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//			sb.append(" - ");
//			sb.append(introspectedColumn.getRemarks());
//		}
//		method.addJavaDocLine(sb.toString());
//		method.addJavaDocLine(" */");
//	}
//
//	/**
//	 * setter方法注释
//	 * @param method
//	 * @param introspectedTable
//	 * @param introspectedColumn
//	 */
//	public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//		StringBuilder sb = new StringBuilder();
//		method.addJavaDocLine("/**");
//		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//			sb.append(" * 设置");
//			sb.append(introspectedColumn.getRemarks());
//			method.addJavaDocLine(sb.toString());
//			method.addJavaDocLine(" *");
//		}
//		Parameter parm = method.getParameters().get(0);
//		sb.setLength(0);
//		sb.append(" * @param ");
//		sb.append(parm.getName());
//		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
//			sb.append(" ");
//			sb.append(introspectedColumn.getRemarks());
//		}
//		method.addJavaDocLine(sb.toString());
//		method.addJavaDocLine(" */");
//	}
//
//	/**
//	 * xml中的注释
//	 * @param xmlElement
//	 */
//	public void addComment(XmlElement xmlElement) {
//	}
//
//	public void addJavaFileComment(CompilationUnit compilationUnit) {
//		return;
//	}
//
//	public void addRootComment(XmlElement rootElement) {
//		return;
//	}
//
//	public void addConfigurationProperties(Properties properties) {
//	}
//
//	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
//	}
//
//	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
//	}
//
//	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
//	}
//
//	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
//
//	}
//
//	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//	}
//
//	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
//	}
//}
