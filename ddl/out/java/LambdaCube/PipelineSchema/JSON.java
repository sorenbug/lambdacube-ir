// generated file, do not modify!
// 2016-03-21T11:41:52.343859000000Z

package LambdaCube.PipelineSchema;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.*;
import RT.*;

import LambdaCube.IR.*;

public class JSON {
  // JSON deserializer
  public enum Type { 
    String,
    Map_String_InputType,
    Map_String_ObjectArraySchema,
    Map_String_StreamType,
    FetchPrimitive,
    InputType,
    ObjectArraySchema,
    PipelineSchema,
    StreamType
  }

  public static Object fromJSON(Type type, Object rawObj) throws JSONException, Exception {
    switch (type) {
      case String: return (String)rawObj;
/*
      case Map_String_InputType: {
        var map = new HashMap<String, InputType> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (InputType)fromJSON(Type.InputType,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_ObjectArraySchema: {
        var map = new HashMap<String, ObjectArraySchema> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (ObjectArraySchema)fromJSON(Type.ObjectArraySchema,i.Value));
        }
        return map;
      }
*/
/*
      case Map_String_StreamType: {
        var map = new HashMap<String, StreamType> ();
        foreach(var i in (JSONObject)rawObj) {
          map.Add( (String)fromJSON(Type.String,i.Key)
                 , (StreamType)fromJSON(Type.StreamType,i.Value));
        }
        return map;
      }
*/

      case StreamType: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        StreamType.Tag tagType;
        switch (tag) {
          case "Attribute_Word": tagType = StreamType.Tag.Attribute_Word; break;
          case "Attribute_V2U": tagType = StreamType.Tag.Attribute_V2U; break;
          case "Attribute_V3U": tagType = StreamType.Tag.Attribute_V3U; break;
          case "Attribute_V4U": tagType = StreamType.Tag.Attribute_V4U; break;
          case "Attribute_Int": tagType = StreamType.Tag.Attribute_Int; break;
          case "Attribute_V2I": tagType = StreamType.Tag.Attribute_V2I; break;
          case "Attribute_V3I": tagType = StreamType.Tag.Attribute_V3I; break;
          case "Attribute_V4I": tagType = StreamType.Tag.Attribute_V4I; break;
          case "Attribute_Float": tagType = StreamType.Tag.Attribute_Float; break;
          case "Attribute_V2F": tagType = StreamType.Tag.Attribute_V2F; break;
          case "Attribute_V3F": tagType = StreamType.Tag.Attribute_V3F; break;
          case "Attribute_V4F": tagType = StreamType.Tag.Attribute_V4F; break;
          case "Attribute_M22F": tagType = StreamType.Tag.Attribute_M22F; break;
          case "Attribute_M23F": tagType = StreamType.Tag.Attribute_M23F; break;
          case "Attribute_M24F": tagType = StreamType.Tag.Attribute_M24F; break;
          case "Attribute_M32F": tagType = StreamType.Tag.Attribute_M32F; break;
          case "Attribute_M33F": tagType = StreamType.Tag.Attribute_M33F; break;
          case "Attribute_M34F": tagType = StreamType.Tag.Attribute_M34F; break;
          case "Attribute_M42F": tagType = StreamType.Tag.Attribute_M42F; break;
          case "Attribute_M43F": tagType = StreamType.Tag.Attribute_M43F; break;
          case "Attribute_M44F": tagType = StreamType.Tag.Attribute_M44F; break;
          default: throw new Exception("unknown constructor: " + tag);
        }
        StreamType o = new StreamType();
        o.tag = tagType;
        return o;
      }
      case ObjectArraySchema: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "ObjectArraySchema": {
            ObjectArraySchema.ObjectArraySchema_ tv = new ObjectArraySchema().new ObjectArraySchema_();
            tv.primitive = (FetchPrimitive)fromJSON(Type.FetchPrimitive,obj.get("primitive"));
            tv.attributes = (HashMap<String, StreamType>)fromJSON(Type.Map_String_StreamType,obj.get("attributes"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
      case PipelineSchema: {
        JSONObject obj = (JSONObject)rawObj;
        String tag = obj.getString("tag");
        switch (tag) {
          case "PipelineSchema": {
            PipelineSchema.PipelineSchema_ tv = new PipelineSchema().new PipelineSchema_();
            tv.objectArrays = (HashMap<String, ObjectArraySchema>)fromJSON(Type.Map_String_ObjectArraySchema,obj.get("objectArrays"));
            tv.uniforms = (HashMap<String, InputType>)fromJSON(Type.Map_String_InputType,obj.get("uniforms"));
            return tv;
          }
          default: throw new Exception("unknown constructor: " + tag);
        }
      }
    }
    throw new Exception("unknown type");
  }
}