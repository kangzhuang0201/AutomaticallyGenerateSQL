package GeneratorMybitas;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, SQLException, InvalidConfigurationException, XMLParserException, IOException {
        args = new String[] { "-configfile", "src/main/mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);

//        App app = new App();
//        app.generateArtifacts();//自动生成

//        int a[] = {2,7,11,15};
//        twoSum(a,9);



    }
    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int i = 0 ; i < nums.length; i++){
            for(int j = nums.length - 1; j >= 0;j-- ){

                if( nums[i] + nums[j] == target && i != j){
                    if(i > j){
                        a[0] = i;
                        a[1] = j;
                    } else {
                        a[0] = j;
                        a[1] = i;
                    }
                    System.out.println(a[0]+" "+a[1]);
                }

            }
        }
        return a;
    }

    private void generateArtifacts() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

        List<String> warnings = new ArrayList<String>();

        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration
                (this.getClass().getResourceAsStream("/mybatis-generator-config.xml"));

        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,defaultShellCallback,warnings);

        myBatisGenerator.generate(null);
    }
}
