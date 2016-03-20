// generated file, do not modify!
// 2016-03-21T11:41:52.460562000000Z

package LambdaCube.TypeInfo;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.*;
import RT.*;

import LambdaCube.IR.*;

public class JSON {
  // JSON deserializer
  public enum Type { 
    Int,
    String,
    Array_Range,
    Array_TypeInfo,
    CompileResult,
    Pipeline,
    Range,
    TypeInfo
  }

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case Int: return (Integer)rawObj;
      case String: return (String)rawObj;
//      case Array_Range: return ((JArray)obj).Select(x => fromJSON (Type.Range, x)).ToList();
//      case Array_TypeInfo: return ((JArray)obj).Select(x => fromJSON (Type.TypeInfo, x)).ToList();

      case Range: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "Range": {
            Range.Range_ tv = new Range().new Range_();
            tv.startLine = (Integer)fromJSON(Type.Int,obj.get("startLine"));
            tv.startColumn = (Integer)fromJSON(Type.Int,obj.get("startColumn"));
            tv.endLine = (Integer)fromJSON(Type.Int,obj.get("endLine"));
            tv.endColumn = (Integer)fromJSON(Type.Int,obj.get("endColumn"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case TypeInfo: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "TypeInfo": {
            TypeInfo.TypeInfo_ tv = new TypeInfo().new TypeInfo_();
            tv.range = (Range)fromJSON(Type.Range,obj.get("range"));
            tv.text = (String)fromJSON(Type.String,obj.get("text"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case CompileResult: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "CompileError": {
            CompileResult.CompileError_ tv = new CompileResult().new CompileError_();
            tv._0 = (ArrayList<Range>)fromJSON(Type.Array_Range,obj.get("arg0"));
            tv._1 = (String)fromJSON(Type.String,obj.get("arg1"));
            tv._2 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg2"));
            return tv;
          }
          case "Compiled": {
            CompileResult.Compiled_ tv = new CompileResult().new Compiled_();
            tv._0 = (String)fromJSON(Type.String,obj.get("arg0"));
            tv._1 = (Pipeline)fromJSON(Type.Pipeline,obj.get("arg1"));
            tv._2 = (ArrayList<TypeInfo>)fromJSON(Type.Array_TypeInfo,obj.get("arg2"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
    }
    throw new Exception("unknown type");
  }
}