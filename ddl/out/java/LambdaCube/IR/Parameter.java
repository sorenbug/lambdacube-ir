// generated file, do not modify!
// 2016-03-21T11:41:51.714241000000Z

package LambdaCube.IR;

import java.util.ArrayList;
import java.util.HashMap;
import RT.*;


public class Parameter {
  public enum Tag { 
    Parameter
  }
  public Tag tag;

  public class Parameter_ extends Parameter { 
    public String name;
    public InputType ty;
    public Parameter_() { tag = Parameter.Tag.Parameter; }
  }
}
