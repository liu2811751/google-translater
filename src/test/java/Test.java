import org.hwj.GoogleApi;

public class Test {

    public static void main(String[] args) throws Exception {
        // 普通方式初始化
        GoogleApi googleApi = new GoogleApi();
        // 通过代理
//        GoogleApi googleApi = new GoogleApi("122.224.227.202", 3128);
        String result = googleApi.translate("刚刚，64人新当选中科院院士！", "zh-CN", "id");
        System.out.println(result);
    }
}
