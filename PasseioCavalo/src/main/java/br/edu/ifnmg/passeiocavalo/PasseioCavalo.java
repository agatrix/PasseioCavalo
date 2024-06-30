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
    
    public static void Movimento(PasseioCavalo cavalo){
        
        for(cavalo.moveNumber = 0; cavalo.moveNumber < 8; cavalo.moveNumber++){
            //Verifica se está dentro do tabuleiro
            if(cavalo.currentColumn+cavalo.vertical[cavalo.moveNumber] > -1
               && cavalo.currentRow+cavalo.horizontal[cavalo.moveNumber] > -1
               && cavalo.currentColumn+cavalo.vertical[cavalo.moveNumber] < 8
               && cavalo.currentRow+cavalo.horizontal[cavalo.moveNumber] < 8)
            {
                //vertifica se já passou pela casa
                if(cavalo.tabuleiro
/*Linha*/         [cavalo.currentRow+cavalo.horizontal[cavalo.moveNumber]]
/*Coluna*/        [cavalo.currentColumn+cavalo.vertical[cavalo.moveNumber]]!=1)
                {
                    
                    System.out.println("["+cavalo.currentRow+"]["+cavalo.currentColumn+"]");
                    cavalo.currentColumn += cavalo.vertical[cavalo.moveNumber];
                    cavalo.currentRow += cavalo.horizontal[cavalo.moveNumber];
                    cavalo.tabuleiro[cavalo.currentRow][cavalo.currentColumn] = 1;
                    cavalo.contador+=1;
                    cavalo.moveNumber=0;
                    
                }
                
            }
        }
        System.out.println("["+cavalo.currentRow+"]["+cavalo.currentColumn+"]");
        System.out.println(cavalo.contador);
    }
    
    
    
}
