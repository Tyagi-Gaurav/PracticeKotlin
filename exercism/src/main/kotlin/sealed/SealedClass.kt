package sealed

sealed class MessageType

class MessageSuccess(val msg : String) : MessageType()

class MessageFailure(val msg : String, val e : Exception) : MessageType()

