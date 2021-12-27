package questions;

public class Googlequestion {

	public static void main(String[] args) {
		
		

	}
	public char[][] rotateTheBox(char[][] box) {
        char[][] ans = new char[box[0].length][box.length];
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[i].length;j++){
                if(box[i][j]=='*'){
                    for(int p=j;p>=0;p--){
                        if(box[i][p]=='.'){
                            box[i][p]='#';
                            for(int k=0;k<p;k++){
                                if(box[i][k]!='.'){
                                    box[i][k]='.';
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            }
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[i].length;j++){
                for(int p=j;p>=0;p--){
                    if(box[i][j]=='.'){
                        box[i][j]='#';
                        for(int l=0;l<p;l++){
                            if(box[i][j]!='.'){
                                box[i][j]='.';
                                break;
                            }
                    }
                }
                }
            }
        }
        int o = ans.length-1;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[j][i]=box[o][j];
        }
            o--;
        }
        return ans;
    }
}
