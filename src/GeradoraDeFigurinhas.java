import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    
    

    public void cria() throws IOException {
// leitura da imagem

  BufferedImage imagemOriginal =  ImageIO.read((new File("entrada/filme.jpg")));

// cria nova imagem em memória com transparência e com novo tamanho
int largura = imagemOriginal.getWidth();
int altura = imagemOriginal.getHeight();
int novaAltura = altura + 200;
BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

//copiar a imagem original para nova imagem
Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
graphics.drawImage(imagemOriginal, 0, 0, null);
// escrever frase no sticker



//escrever nova imagem em um arquivo
ImageIO.write(novaImagem, "png",new File("saida/figurinha.png"));
    }

    public static void main(String[] args) throws IOException {
    var geradora = new GeradoraDeFigurinhas();
    geradora.cria();
    }
}

