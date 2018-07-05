import com.xxl.emoji.EmojiParser;
import com.xxl.emoji.core.FitzpatrickAction;

public class Test {

    public static void main(String[] args) {

        String str = "An 😀awesome 😃string with a few 😉emojis!";

        // alias
        String str1 = EmojiParser.parseToAliases(str, FitzpatrickAction.PARSE);
        System.out.println(str1);
        System.out.println(EmojiParser.parseToUnicode(str1));   // back to emoji

        // to html decimal
        String str2 = EmojiParser.parseToHtmlDecimal(str, FitzpatrickAction.PARSE);
        System.out.println(str2);
        System.out.println(EmojiParser.parseToUnicode(str2));


        // to html hex decimal
        String str3 = EmojiParser.parseToHtmlHexadecimal(str, FitzpatrickAction.PARSE);
        System.out.println(str3);
        System.out.println(EmojiParser.parseToUnicode(str3));
    }

}
