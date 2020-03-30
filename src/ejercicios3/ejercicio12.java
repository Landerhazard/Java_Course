package ejercicios3;

public class ejercicio12 {

    public static void main(String[] args) {
        char i = '0', j = '0', k = '0', l = '0', m = '0';
        char I, J, K, L, M;
        while (i <= '9') {
            if (i == '3'){I = 'E';} else {I = i;}
            while (j <= '9') {
                if (j == '3'){J = 'E';} else {J = j;}
                while (k <= '9') {
                    if (k == '3'){K = 'E';} else {K = k;}
                    while (l <= '9') {
                        if (l == '3'){L = 'E';} else {L = l;}
                        while (m <= '9') {
                            if (m == '3'){M = 'E';} else {M = m;}
                            System.out.println(I + "-" + J + "-" + K + "-" + L + "-" + M);
                            m++;
                        }
                        m = '0';
                        l++;
                    }
                    l = '0';
                    k++;
                }
                k = '0';
                j++;
            }
            j = '0';
            i++;
        }
    }
}
