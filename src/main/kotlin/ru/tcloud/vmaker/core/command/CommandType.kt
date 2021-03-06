package ru.tcloud.vmaker.core.command

enum class CommandType(val op: String) {
    CREATE_FROM_DIR("cfd"),
    PREPARE_DIR("pd"),
    UPLOAD_VIDEO("uv")

}

val opToType = CommandType.values().associateBy { it.op }