import org.hwj.GoogleApi;

public class Test {

    public static void main(String[] args) throws Exception {
        // 普通方式初始化
        GoogleApi googleApi = new GoogleApi();
        // 通过代理
//        GoogleApi googleApi = new GoogleApi("114.55.55.186", 9038);
        String result = googleApi.translate("我是中国人", "zh-CN", "en");
        System.out.println(result);
    }
}
