package GeneratorMybitas;

import com.github.pagehelper.util.StringUtil;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class MyCommentGenerator extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        //添加字段注释
        if (StringUtil.isNotEmpty(introspectedColumn.getRemarks())){
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * "+introspectedColumn.getRemarks());
            field.addJavaDocLine(" */");
        }else {
            return;
        }

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }
}
