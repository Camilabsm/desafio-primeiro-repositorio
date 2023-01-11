public class AtividadeCurso extends Conteudo {
    
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public AtividadeCurso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "{Curso: Título = " + getTitulo() + ", Descrição = " + getDescricao() + ", Carga Horária = " + cargaHoraria + "h}";
    }


    
    
}
