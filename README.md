# Java LinkedHashMap Demo

Educational Java program demonstrating LinkedHashMap features: insertion order maintenance, duplicate key overwriting, and null key-value handling. [web:18]

## Features
- Preserves key-value pairs in insertion order
- Overwrites values for duplicate keys (e.g., key `1` shows latest value)
- Supports null keys and values
- Two test cases: Integer-Integer and String-Integer mappings

## Tech Stack
- Java 8+
- Collections Framework (LinkedHashMap)

## Output Examples

**Integer-Integer Map:**
{null=null, 1=2, 2=3, 5=3, 4=5, 9=5, 6=7}Shows insertion order with duplicates overwritten.

**String-Integer Map:**
{a=2, b=1, c=1, d=1, s=1, f=1, z=1, h=1}Key "a" overwritten from 1→2.

## Getting Started

1. Clone the repository
2. Open in VS Code / IntelliJ / Eclipse
3. Run `linkedhashmap.java`
4. Observe console output demonstrating LinkedHashMap behavior

## Key Learnings
- **Order**: Elements appear in insertion sequence [web:3]
- **Duplicates**: Same key replaces previous value
- **Null Support**: Allows null keys/values (unlike HashMap limitations)

## Project Structure
├── collections/
│ └── linkedhashmap.java # Main demo class
└── README.md
## For Job Applications
Perfect portfolio addition for Java Collections interviews. Highlights understanding of:
- HashMap vs LinkedHashMap differences
- Interview questions on order preservation
- Practical debugging with collections

Built by [BHUVANESH] - Java Full Stack Developer
