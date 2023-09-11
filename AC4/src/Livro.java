public class Livro {
    String titulo;
    String autor;
    String formato;
    boolean reservado;
    boolean emprestado;

    Livro(String titulo, String autor, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println(titulo + " (" + formato + ") foi reservado com sucesso.");
        } else {
            System.out.println(titulo + " (" + formato + ") já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println(titulo + " (" + formato + ") teve sua reserva cancelada.");
        } else {
            System.out.println(titulo + " (" + formato + ") não estava reservado.");
        }
    }

    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println(titulo + " (" + formato + ") foi emprestado com sucesso.");
        } else if (emprestado) {
            System.out.println(titulo + " (" + formato + ") já está emprestado.");
        } else {
            System.out.println(titulo + " (" + formato + ") precisa ser reservado primeiro.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(titulo + " (" + formato + ") foi devolvido com sucesso.");
        } else {
            System.out.println(titulo + " (" + formato + ") não está emprestado.");
        }
    }
}

