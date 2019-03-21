/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapuntoscolombia;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author juan.gomezg
 */
public class PruebaPuntosColombia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = null;
        StringTokenizer st = null;
        int N = Integer.parseInt(buffer.readLine().trim());
        int array1[] = new int[1000010];
        int array2[] = new int[1000010];
        s = buffer.readLine().trim();
        st = new StringTokenizer(s);
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            array1[num]++;
        }
        int M = Integer.parseInt(buffer.readLine().trim());

        s = buffer.readLine().trim();
        st = new StringTokenizer(s);
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            array2[num]++;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                out.print(i + " ");
            }
        }
        out.close();
    }

}
