package br.edu.ifnmg.passeiocavalo;

/**
 *
 * @author Gustavo
 */
public class PasseioCavalo {

    int[][] tabuleiro = new int[8][8];
    //Por não passar nenhum valor, em Java inicializar int como 0;
    
    int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    int[] vertical = {-1,-2,-2,-1,1,2,2,1};
    
    int currentRow, currentColumn, moveNumber;
    int contador; //Variavel para contar quantas casas o cavalo passou
    
    
    PasseioCavalo(int x, int y){ //Construtor x=horizontal y=vertical
        this.currentColumn = y;
        this.currentRow = x;
        this.tabuleiro[x][y] = 1;
        //O valor inicial do tabuleiro já começa marcado.
        
        this.contador = 1;
    }
    public boolean validarCasa(){
        //Verifica se está dentro do tabuleiro
        if(currentColumn+vertical[moveNumber] > -1
           && currentRow+horizontal[moveNumber] > -1
           && currentColumn+vertical[moveNumber] < 8
           && currentRow+horizontal[moveNumber] < 8)
        {
            //vertifica se já passou pela casa
            if(tabuleiro
/*Linha*/     [currentRow+horizontal[moveNumber]]
/*Coluna*/    [currentColumn+vertical[moveNumber]]==0)
            {
                return true;
            }   
        }
        return false;
    }
    
    public void printarTabuleiro(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.printf("[%2d]", tabuleiro[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void movimentar(){
        
        for(moveNumber = 0; moveNumber < 8; moveNumber++){  
            if(validarCasa()){ 
                currentColumn += vertical[moveNumber]; //Atualiza coluna
                currentRow += horizontal[moveNumber];  //Atualiza Linha
                contador+=1;                           //Adiciona contador
                tabuleiro[currentRow][currentColumn] = contador;
                moveNumber=0;
                //Reseta o movimento, pra verificar as casas da nova posição
            }
        }
        printarTabuleiro();
        System.out.println("Casas visitadas: "+contador);
    }
    
    
    
}
