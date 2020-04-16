
package sortowanie;

public class SortowanieBbabelkowe implements Sortable {
    int liczbaPorownan = 0;
    @Override
    public int[] sort(int[] tab) {
        int liczbaPoczatkowa;
        do {
            liczbaPoczatkowa=liczbaPorownan;
            for (int i=0; i<tab.length-1; i++){
                if (tab[i]>tab[i+1]){
                    int a = tab[i];
                    int b =tab[i+1];
                    tab[i+1]=a;
                    tab[i]=b;
                    liczbaPorownan++;
                }
            }
        } while (liczbaPorownan!=liczbaPoczatkowa);
        for (int x=0; x<tab.length;x++){
            System.out.print(tab[x]+" , ");
        }
      
        return tab;
    }

    @Override
    public double step_counting() {
        return liczbaPorownan;
    }
}
