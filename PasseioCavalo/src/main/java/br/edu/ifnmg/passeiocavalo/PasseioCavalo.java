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

    public void movimentar(){
        
        for(moveNumber = 0; moveNumber < 8; moveNumber++){
            //Verifica se está dentro do tabuleiro
            if(currentColumn+vertical[moveNumber] > -1
               && currentRow+horizontal[moveNumber] > -1
               && currentColumn+vertical[moveNumber] < 8
               && currentRow+horizontal[moveNumber] < 8)
            {
                //vertifica se já passou pela casa
                if(tabuleiro
/*Linha*/         [currentRow+horizontal[moveNumber]]
/*Coluna*/        [currentColumn+vertical[moveNumber]]!=1)
                {
                    
                    System.out.println("["+currentRow+"]["+currentColumn+"]");
                    currentColumn += vertical[moveNumber];
                    currentRow += horizontal[moveNumber];
                    tabuleiro[currentRow][currentColumn] = 1;
                    contador+=1;
                    moveNumber=0;
                    
                }
                
            }
        }
        System.out.println(contador);
    }
    
    
    
}
