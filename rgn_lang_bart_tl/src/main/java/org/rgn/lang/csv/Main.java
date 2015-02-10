package org.rgn.lang.csv;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.StringReader;
import java.util.List;

/**
 * Created by ragnarokkrr on 09/02/15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // the input source
        String source =
                "value1,value2,\"value3.1,\"\",value3.2\"" + "\n" +
                        "\"line\nbreak\",Bbb,end";

        // create an instance of the lexer
        CSVLexer lexer = new CSVLexer(new ANTLRInputStream(new StringReader(source)));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //tokenTraversal(tokens);
        CSVParser parser = new CSVParser(tokens);

        //
        List<List<String>> data = parser.file().data;
        // display the contents of the CSV source
        for(int r = 0; r < data.size(); r++) {
            List<String> row = data.get(r);
            for(int c = 0; c < row.size(); c++) {
                System.out.println("(row=" + (r+1) + ",col=" + (c+1) + ") = " + row.get(c));
            }
        }
    }

    private static void tokenTraversal(CommonTokenStream tokens) {
        // when using ANTLR v3.3 or v3.4, un-comment the next line:
        tokens.fill();

        // traverse the tokens and print them to see if the correct tokens are created
        int n = 1;
        for (Object o : tokens.getTokens()) {
            CommonToken token = (CommonToken) o;
            System.out.println("token(" + n + ") = " + token.getText().replace("\n", "\\n"));
            n++;
        }
    }

}
