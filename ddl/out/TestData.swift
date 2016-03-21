// generated file, do not modify!
<<<<<<< d022971b99be214c71429d58f97f85b13e33a426
<<<<<<< 4d40c4ee5ed15544d2ac7fb1ea7b61e89766d277
<<<<<<< c5e063b3c9aeff65161e24445e9672daff980b45
<<<<<<< 3b50722f433ec5ecc515ea1441fd633d85118cb9
// 2016-03-01T13:00:40.829757000000Z
=======
// 2016-03-20T21:42:13.043021000000Z
>>>>>>> working c# backend
=======
// 2016-03-20T22:19:43.692329000000Z
>>>>>>> fix c#
=======
// 2016-03-21T11:36:01.244766000000Z
>>>>>>> work on java json loader
=======
// 2016-03-21T11:41:52.508392000000Z
>>>>>>> improve java json

enum ClientInfo {
  case ClientInfo(ClientInfo_Data)
    struct ClientInfo_Data {
      var clientName : String
      var clientBackend : Backend
    }
}

enum Frame {
  case Frame(Frame_Data)
    struct Frame_Data {
      var renderCount : Int
      var frameUniforms : Dictionary<String, Value>
      var frameTextures : Dictionary<String, Int>
    }
}

enum Scene {
  case Scene(Scene_Data)
    struct Scene_Data {
      var objectArrays : Dictionary<String, Array<Int>>
      var renderTargetWidth : Int
      var renderTargetHeight : Int
      var frames : Array<Frame>
    }
}

enum PipelineInfo {
  case PipelineInfo(PipelineInfo_Data)
    struct PipelineInfo_Data {
      var pipelineName : String
      var pipeline : Pipeline
    }
}

enum RenderJob {
  case RenderJob(RenderJob_Data)
    struct RenderJob_Data {
      var meshes : Array<Mesh>
      var textures : Array<String>
      var schema : PipelineSchema
      var scenes : Array<Scene>
      var pipelines : Array<PipelineInfo>
    }
}

enum FrameResult {
  case FrameResult(FrameResult_Data)
    struct FrameResult_Data {
      var frRenderTimes : Array<Float>
      var frImageWidth : Int
      var frImageHeight : Int
    }
}

enum RenderJobResult {
  case RenderJobResult(FrameResult)
  case RenderJobError(String)
}


extension Int {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Int32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension UInt32 {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Float {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Bool {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension String {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Array {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Dictionary {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}
extension Maybe {
    var toJSON : [String: AnyObject] {
        return ["":""]
    }
}



extension ClientInfo {
  var toJSON : [String: AnyObject] {
    switch self {
      case .ClientInfo(let v):
        return [ "tag" : "ClientInfo"
               , "clientName" : v.clientName.toJSON
               , "clientBackend" : v.clientBackend.toJSON
               ]
    }
  }
}
extension Frame {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Frame(let v):
        return [ "tag" : "Frame"
               , "renderCount" : v.renderCount.toJSON
               , "frameUniforms" : v.frameUniforms.toJSON
               , "frameTextures" : v.frameTextures.toJSON
               ]
    }
  }
}
extension Scene {
  var toJSON : [String: AnyObject] {
    switch self {
      case .Scene(let v):
        return [ "tag" : "Scene"
               , "objectArrays" : v.objectArrays.toJSON
               , "renderTargetWidth" : v.renderTargetWidth.toJSON
               , "renderTargetHeight" : v.renderTargetHeight.toJSON
               , "frames" : v.frames.toJSON
               ]
    }
  }
}
extension PipelineInfo {
  var toJSON : [String: AnyObject] {
    switch self {
      case .PipelineInfo(let v):
        return [ "tag" : "PipelineInfo"
               , "pipelineName" : v.pipelineName.toJSON
               , "pipeline" : v.pipeline.toJSON
               ]
    }
  }
}
extension RenderJob {
  var toJSON : [String: AnyObject] {
    switch self {
      case .RenderJob(let v):
        return [ "tag" : "RenderJob"
               , "meshes" : v.meshes.toJSON
               , "textures" : v.textures.toJSON
               , "schema" : v.schema.toJSON
               , "scenes" : v.scenes.toJSON
               , "pipelines" : v.pipelines.toJSON
               ]
    }
  }
}
extension FrameResult {
  var toJSON : [String: AnyObject] {
    switch self {
      case .FrameResult(let v):
        return [ "tag" : "FrameResult"
               , "frRenderTimes" : v.frRenderTimes.toJSON
               , "frImageWidth" : v.frImageWidth.toJSON
               , "frImageHeight" : v.frImageHeight.toJSON
               ]
    }
  }
}
extension RenderJobResult {
  var toJSON : [String: AnyObject] {
    switch self {
      case .RenderJobResult(let arg0):
        return [ "tag" : "RenderJobResult", "arg0" : arg0.toJSON]
      case .RenderJobError(let arg0):
        return [ "tag" : "RenderJobError", "arg0" : arg0.toJSON]
    }
  }
}

enum Maybe<T> {
  case Nothing
  case Just(T)
}

enum Type {
  case Int
  case Int32
  case Word
  case Word32
  case Float
  case Bool
  case String
  case Array(Type)
  case List(Type)
  case Maybe(Type)
  case Map(Type,Type)
  case ClientInfo
  case Frame
  case Scene
  case PipelineInfo
  case RenderJob
  case FrameResult
  case RenderJobResult
}

func fromJSON(type: Type, personName: String) -> Any {
  switch type {
    case .Int:    return 0
    case .Int32:  return 0
    case .Word:   return 0
    case .Word32: return 0
    case .Float:  return 0.0
    case .Bool:   return false
    case .String: return ""
    case .Array(let a): return fromJSON(a,personName)
    case .List(let a):  return fromJSON(a,personName)
    case .Maybe(let a): return fromJSON(a,personName)
  }
  return 0;
}