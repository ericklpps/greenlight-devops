# Green Light - DevOps

## Projeto
API Java para gerenciamento de escolas do sistema Green Light com banco Azure.

## Stack Tecnológica
- **Backend**: Java (Spring Boot)
- **Banco**: Azure SQL Database
- **Deploy**: Azure Web App

## Modelo de Dados

### Tabela: ESCOLA
```sql
CREATE TABLE ESCOLA (
    ID NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    NOME VARCHAR2(100) NOT NULL,
    CIDADE VARCHAR2(50) NOT NULL,
    ESTADO VARCHAR2(2) NOT NULL,
    ATIVO CHAR(1) DEFAULT 'S' CHECK (ATIVO IN ('S', 'N'))
);
```

## Deploy

### 1. Banco Azure
```bash
# Azure SQL Database configurado
# Tabela gl_ESCOLA criada
```

### 2. Deploy Azure Web App
```bash
# Deploy manual via Azure Portal
```

### Exemplo JSON
```json
{
  "nome": "Escola Municipal Verde",
  "cidade": "São Paulo",
  "estado": "SP",
  "ativo": "S"
}
```

Acesso a api: 
https://apigreenlight-cmf8dgdeafa5cbhm.eastus2-01.azurewebsites.net/escola
