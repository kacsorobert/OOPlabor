package labor10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileUtil.encode("labor10/src/labor10_3/FileUtil.java", "labor10/temp1.java");
            FileUtil.decode("labor10/temp1.java", "labor10/temp2.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
