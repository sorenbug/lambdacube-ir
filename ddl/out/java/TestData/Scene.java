// generated file, do not modify!
// 2016-11-11T11:17:03.685172000000Z

package TestData;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;

import LambdaCube.IR.*;
import LambdaCube.Mesh.*;
import LambdaCube.PipelineSchema.*;

public class Scene {
  public enum Tag { 
    Scene
  }
  public Tag tag;

  public class Scene_ extends Scene { 
    public HashMap<String, ArrayList<Integer>> objectArrays;
    public Integer renderTargetWidth;
    public Integer renderTargetHeight;
    public ArrayList<Frame> frames;
    public Scene_() { tag = Scene.Tag.Scene; }
  }
}

