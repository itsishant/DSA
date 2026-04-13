# include <stdio.h>

int main() {
    int i,j,r,c;
    int k = 1;

    int mat[10][10];
    int sparse[20][3];

    scanf("%d %d", &r, &c);

    for (i = 0; i<r; i++) {
        for(j = 0; j<c; j++) {
            scanf("%d",&mat[i][j]);
            if ( mat[i][j] != 0) {
                sparse[k][0] = i;
                sparse[k][1] = j;
                sparse[k][2] = mat[i][j];
                k++; 
            }
        }
    }
    sparse[0][0] = r;
    sparse[0][1] = c;
    sparse[0][2] = k-1;

    for( i = 0; i<k; i++) {
    printf("%d %d %d", sparse[i][0], sparse[i][1], sparse[i][2]);
    }
}
