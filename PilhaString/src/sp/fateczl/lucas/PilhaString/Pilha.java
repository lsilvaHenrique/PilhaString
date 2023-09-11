package sp.fateczl.lucas.PilhaString;

public class Pilha {
    No topo;
    
    public Pilha() {
        this.topo = null;
    }
    
    public boolean isEmpty() {
        return this.topo == null;
    }
    
    public void push(final String e) {
        final No elemento = new No();
        elemento.dado = e;
        if (this.isEmpty()) {
            this.topo = elemento;
        }
        else {
            elemento.proximo = this.topo;
            this.topo = elemento;
        }
    }
    
    public String pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("N\u00e3o h\u00e1 elementos para desempilhar");
        }
        final String dado = this.topo.dado;
        this.topo = this.topo.proximo;
        return dado;
    }
    
    public String top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("N\u00e3o h\u00e1 elementos na pilha");
        }
        return this.topo.dado;
    }
    
    public int size() {
        int count = 0;
        if (!this.isEmpty()) {
            No auxiliar;
            for (auxiliar = this.topo, count = 1; auxiliar.proximo != null; auxiliar = auxiliar.proximo, ++count) {}
        }
        return count;
    }
}
