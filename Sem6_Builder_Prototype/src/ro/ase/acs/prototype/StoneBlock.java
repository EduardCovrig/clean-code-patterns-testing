package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock{
    private byte[] texture;

    public StoneBlock() {
        System.out.println("Loading...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        texture=new byte[]{2,3,4};
    }

    @Override
    public void render() {
        System.out.println("Rendering Stone block at "+ x + " " + y + " " + z);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock copy= (StoneBlock) super.clone();
        copy.texture=this.texture.clone();
        return copy;
    }
}
