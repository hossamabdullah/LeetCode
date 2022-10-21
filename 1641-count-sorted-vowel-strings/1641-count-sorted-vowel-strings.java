class Solution {
    int a=1, e=1, i=1, o=1, u=1;
    
    public int countVowelStrings(int n) {
        for(int i=1; i<n; i++){
            increment();
        }
        return a + e + i + o + u;
    }
    
    public void increment(){
        a=a+e+i+o+u;
        e=e+i+o+u;
        i=i+o+u;
        o=o+u;
        u=u;
    }
}


/*
a,e,i,o,u


n=1                         5
a,e,i,o,u                   5

n=2
a(a,e,i,o,u)                5
e(e,i,o,u)                  4
i(i,o,u)                    3
o(o,u)                      2    
u(u)                        1    


n=3
a(a((a,e,i,o,u)),e((e,i,o,u)),i((i,o,u)),o((o,u)),u((u)))  15    Sum(5)
e(e((e,i,o,u)),i((i,o,u)),o((o,u)),u((u)))                 10    Sum(4)
i(i((i,o,u)),o((o,u)),u((u)))                              6     Sum(3)
o(o((o,u)),u((u)))                                         3     Sum(2)
u(u((u)))                                                  1     Sum(1)


n=4
a(a((a(5),e(4),i(3),o(2),u(1)))
,e((e(4),i(3),o(2),u(1))),
i((i(3),o(2),u(1))),                                       
o((o(2),u(1))),u((u(1))))                                  35    Sum(5)+Sum(4)+Sum(3)+Sum(2)+Sum(1)
e(e((e,i,o,u)),i((i,o,u)),o((o,u)),u((u)))                 10    Sum(4)+Sum(3)+Sum(2)+Sum(1)
i(i((i,o,u)),o((o,u)),u((u)))                              6     Sum(3)+Sum(2)+Sum(1)
o(o((o,u)),u((u)))                                         3     Sum(2)+Sum(1)
u(u((u)))                                                  1     Sum(1)



n=5
Sum(5)+2*(Sum(4)+Sum(3)+Sum(2)+Sum(1))
Sum(4)+2*(Sum(3)+Sum(2)+Sum(1))
Sum(3)+2*(Sum(2)+Sum(1))
Sum(2)+2*(Sum(1))
Sum(1)




n=6
Sum(5)+3*Sum(4)+4*sum(3)+6*sum(2)+(8+1)*Sum(1)









*/