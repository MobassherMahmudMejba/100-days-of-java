#include<stdio.h>
#include<string.h>
struct Customer{
    int id;
    char name[50];
    float loan;
    float rate;
    int time;
};
int main() {
    int n;
    struct Customer c; 
    int max_id = 0;
    int max_total = 0;
    char max_name[50];
    scanf("%d",&n);
    for (int i = 0; i < n; i++) {
        scanf("%d %s %f %f %d", &c.id, c.name, &c.loan, &c.rate, &c.time);
        int interest =(c.loan*c.rate*c.time)/100;
        int total=c.loan+interest;
        printf("%d | %-5s | %-5d | %d\n", c.id, c.name, interest, total);
        if (total>max_total) {
            max_total=total;      
            max_id=c.id;          
            strcpy(max_name,c.name); 
        }
    }
    printf("\nHighest Payable Customer: %s (%d)", max_name, max_id);
    return 0;
}