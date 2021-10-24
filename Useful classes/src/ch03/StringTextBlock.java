package ch03;

public class StringTextBlock {
    public static void main(String[] args) {
    
/*
 text block: java 13에서 추가된 기능
 StringBuffer나 StringBuilder를 사용하지 않고 문자열을 이어붙일때 사용.
 html이나 json 문자열을 만들때 유용하게 사용할 수 있다.
 """(" 3개) 사이에 문자열을 넣어 이어붙일 수 있다.
 */
        
        String textBlocks = """
                hello,
                hi,
                how are you""";
           System.out.println(textBlocks);             
    }
}
