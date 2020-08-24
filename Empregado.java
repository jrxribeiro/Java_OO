public class Empregado{

    private String  nome;

    private String  cargo;

    //private double  salario;

    String getMarca(){  // crio um método chamado consultarMarca

        return marca;         // vou retornar o que estiver armazenado no atributo marca

    }

    // crio um método chamado modificarMarca que recebe uma informação no parâmetro NOVAMARCA

    // de mesmo tipo que o referido atributo. No seu corpo, eu simplesmente faço uma atribuição

    void setMarca(String novaMarca){

        marca = novaMarca;

    }



    String getModelo(){

        return modelo;

    }

    void setModelo(String novoModelo){

        modelo = novoModelo;

    }



    int getAno(){

        return ano;

    }

    void setAno(int novoAno){

        ano = novoAno;

    }



    String getCor(){

        return cor;

    }

    void setCor(String novaCor){

        cor = novaCor;

    }



    double getPreco(){

        return preco;

    }

    void setPreco(double novoPreco){

        preco = novoPreco;

    }



    boolean isLicenciado(){

        return licenciado;

    }

    void setLicenciado(boolean novoLicenciado){

        licenciado = novoLicenciado;

    }



    boolean isIpvaPago(){

        return ipvaPago;

    }

    void setIpvaPago(boolean novoIpvaPago){

        ipvaPago = novoIpvaPago;

    }



    // vou criar as funcionalidades para poder manipular o carro

    void exibirInfo(){

        System.out.println("Carro: "+marca+"/"+modelo+" ("+ano+") Cor:" +cor+" R$ "+preco);

        if (licenciado){

            System.out.print("     Licenciado");

        }

        else{

            System.out.print("     Documentos Pendentes");

        }

        if (ipvaPago){

            System.out.println("  IPVA Pago");

        }

        else{

            System.out.println("  IPVA a pagar");

        }

        System.out.println("  VALOR DO IPVA R$ "+calcularIPVA());

    }



    private double calcularIPVA(){

        double ipva;

        if (ano <= 2000){

            ipva = 0.0;

        }

        else{

            ipva = preco * 0.045;

        }

        return ipva;

    }

}