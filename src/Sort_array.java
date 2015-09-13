/**
 * Created by perry on 9/14/15.
 */
public class Sort_array {
   static int[] merge (int[] a, int[] b)
   {
       int A=a.length;
       int B=b.length;
       if (A==0) return b;
       if (B==0) return a;
       else
       {
       int C=A+B;
       int[] M=new int[C];
       int i=0; int j=0;
       while  ((i<A)&&(j<B))
       {
           if (a[i]>b[j])
           {
               M[i+j]=b[j]; j++;
           }
           else
           {
               M[i+j]=a[i]; i++;
           }
       }
       while (i<A)
       {
           M[i+j]=a[i]; i++;
       }
       while (j<B)
       {
           M[i+j]=b[j]; j++;
       }
       return M;
   }
   }

    public void sort (int [] Arr)
    {
        if (Arr.length>1)
        {
            int LP=Arr.length;
            int D=LP/2; int E=LP-D;
            int[] d=new int[D];
            int[] e=new int [E];
            for (int y=0; y<D; y++)
                d[y]=Arr[y];
            for (int z=0; z<E; z++)
                e[z]=Arr[z+D];
            sort (d);
            sort (e);
            int[] MMM= merge(d, e); //I don't like
            for (int r=0; r<LP; r++)
            {
                Arr[r]=MMM[r];
            }


        }
    }
}
