import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class MyObject {
  String content = "<script>alert('hello');</script>";
}

class Simple {
  public static void main(String[] args) {
    Gson gson = new GsonBuilder()
            //.disableHtmlEscaping()
            .create();

    String json = gson.toJson(new MyObject());
    System.out.println(json);
  }
}