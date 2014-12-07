<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="list">
		<list>
			<xsl:apply-templates />
		</list>
	</xsl:template>
	<xsl:template match="sportpants">
		<sportpants>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</sportpants>
	</xsl:template>
	<xsl:template match="trousers">
		<trousers>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</trousers>
	</xsl:template>
	<xsl:template match="anorak">
		<anorak>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</anorak>
	</xsl:template>
	<xsl:template match="coat">
		<coat>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</coat>
	</xsl:template>
	<xsl:template match="sandals">
		<sandals>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</sandals>
	</xsl:template>
	<xsl:template match="sneakers">
		<sneakers>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</sneakers>
	</xsl:template>
	<xsl:template match="hat">
		<hat>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</hat>
	</xsl:template>
	<xsl:template match="cap">
		<cap>
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}">
          <xsl:value-of select="text()" />
        </xsl:attribute>
			</xsl:for-each>
		</cap>
	</xsl:template>

</xsl:stylesheet>